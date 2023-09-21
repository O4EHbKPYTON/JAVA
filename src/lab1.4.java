import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roadCount = scanner.nextInt();
        int maxRoad = 0;
        int maxHeight = 0;

        for (int i = 0; i < roadCount; i++) {
            int tunnelCount = scanner.nextInt();
            int maxTunnelHeight = 0;

            for (int j = 0; j < tunnelCount; j++) {
                int tunnelHeight = scanner.nextInt();
                if (tunnelHeight > maxTunnelHeight) {
                    maxTunnelHeight = tunnelHeight;
                }
            }

            if (maxTunnelHeight < maxHeight || maxHeight == 0) {
                maxHeight = maxTunnelHeight-1;
                maxRoad = i+1;
            }
        }

        System.out.println(maxRoad + " " + maxHeight);
    }
}