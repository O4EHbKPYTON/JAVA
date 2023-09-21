import java.util.*;

class Node {
    int x, y, steps;

    public Node(int x, int y, int steps) {
        this.x = x;
        this.y = y;
        this.steps = steps;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату X клада: ");
        int coordX = scanner.nextInt();
        System.out.print("Введите координату Y клада: ");
        int coordY = scanner.nextInt();

        int[][] island = new int[101][101];

        System.out.println("Введите указания карты:");
        List<String> directions = new ArrayList<>();
        List<Integer> steps = new ArrayList<>();

        while (true) {
            String direction = scanner.next();
            if (direction.equals("стоп")) {
                break;
            }
            int step = scanner.nextInt();
            directions.add(direction);
            steps.add(step);
        }

        Queue<Node> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(new Node(0, 0, 0));

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            int currentX = currentNode.x;
            int currentY = currentNode.y;
            int currentSteps = currentNode.steps;

            // Проверка, достигли ли клада
            if (currentX == coordX && currentY == coordY) {
                System.out.println("Минимальное количество указаний карты: " + currentSteps);
                return;
            }

            for (int i = 0; i < directions.size(); i++) {
                String direction = directions.get(i);
                int step = steps.get(i);

                int newX = currentX;
                int newY = currentY;

                if (direction.equals("север")) {
                    newY += step;
                } else if (direction.equals("юг")) {
                    newY -= step;
                } else if (direction.equals("запад")) {
                    newX -= step;
                } else if (direction.equals("восток")) {
                    newX += step;
                }

                if (newX >= 0 && newX <= 100 && newY >= 0 && newY <= 100) {
                    String key = newX + "," + newY;

                    if (!visited.contains(key)) {
                        visited.add(key);
                        queue.add(new Node(newX, newY, currentSteps + 1));
                    }
                }
            }
        }
    }
}