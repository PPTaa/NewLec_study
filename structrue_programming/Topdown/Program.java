package Topdown;

public class Program {
    public static void main(String[] args) {
        int menu;
        int [][] lottos = null;
        boolean running = true;

        while (running) {
            menu = inputMenu();

            switch (menu) {
                case 1:
                    lottos = createLottosAuto();
                    break;
                case 2:
                    lottos = createLottosManual();
                    
                    break;
                case 3:
                    printLottos(lottos);
                    break;
                case 4:
                    running = false;
                    break;
            } 
        }
        
    }

    private static void printLottos(int[][] lottos) {
    }

    private static int[][] createLottosManual() {
        return null;
    }

    private static int[][] createLottosAuto() {
        return null;
    }

    private static int inputMenu() {
        return 0;
    }
}