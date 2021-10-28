package Lab_3;

public class CreateField {
    static String[] names_of_creatures = {"Андрей", "Борис", "Вова", "Глеб", "Дмитрий",
            "Елена", "Жора", "Зина", "Илья", "Коля"};
    static char[][] gameField = new char[8][8];
    static int[] coordinatesPlayersX = new int[8];
    static int[] coordinatesPlayersY = new int[8];

    static public void makeFields(){
        //Делаем поле пустым:
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                gameField[i][j] = '*';
            }
        }

        //Создаем координаты существ:
        for (int i = 0; i < coordinatesPlayersX.length; i++) {
            coordinatesPlayersX[i] = (int)(Math.random()*8);
            coordinatesPlayersY[i] = (int)(Math.random()*8);

            for (int j = 0; j < i; j++) {
                if (coordinatesPlayersX[i] == coordinatesPlayersX[j] && coordinatesPlayersY[i] == coordinatesPlayersY[j]) {
                    i--;
                    break;
                }
            }
        }

        //Определяем координаты существ:
        for (int i = 0; i < 8; i++) {
            int X = coordinatesPlayersX[i];
            int Y = coordinatesPlayersY[i];
            char head = names_of_creatures[i].charAt(0);
            gameField[X][Y] = head;
        }

        //Выводим Игровое поле:
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                System.out.print(gameField[i][j]);
            }
            System.out.println("");
        }
    }

}
