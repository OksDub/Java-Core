package lesson2;


public class Main {
    public static void main(String[] args) {
       // int a = 1 / 0;
        //test();
        System.out.println("Метод main");
        String[][] successArray =
                {{"1", "3", "5", "6"},
                        {"1", "3", "5", "6"},
                        {"1", "3", "5", "6", "7"},
                        {"1", "3", "5", "6"}};

        try {
            System.out.println("Массив с неверной размерностью");
            System.out.println(transformationArray(successArray));
        } catch (MyArraySizeExceptionH e) {
            e.printStackTrace();
        } catch (MyArrayDataExceptionH e) {
            e.printStackTrace();
        }


        String[][] invalidDataArray =
                {{"1", "3", "5", "6"},
                        {"1", "3", "5a", "6"},
                        {"1", "3", "5", "6"},
                        {"1", "3", "5", "6"}};

        try {
            System.out.println("Массив с неверными данными");
            System.out.println(transformationArray(invalidDataArray));

        } catch (MyArraySizeExceptionH e) {
            e.printStackTrace();
        } catch (MyArrayDataExceptionH e) {
            e.printStackTrace();
        }

    }

//    public static void test() {
//        test();
//        test1();
//        System.out.println("Метод test");
//    }
//
//    public static void test1() {
//        test2();
//        System.out.println("Метод test1");
//    }

//    public static void test2() {
//        int a = 1 / 0;
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement stackTraceElement : stackTraceElements) {
//            System.out.println(stackTraceElement.getMethodName() + " " + stackTraceElement.getLineNumber());
//        }
//        System.out.println("Метод test2");
//    }

    public static int transformationArray(String[][] qadroArray) throws MyArraySizeExceptionH, MyArrayDataExceptionH {
        if (qadroArray.length != 4) {
            throw new MyArraySizeExceptionH("Размерность массива не равна 4");
        }

        for (String[] array : qadroArray) {
            if (array.length != 4) {
                throw new MyArraySizeExceptionH("Размерность массива не равна 4");
            }
        }

        int sum = 0;
        for (int i = 0; i < qadroArray.length; i++) {
            for (int j = 0; j < qadroArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(qadroArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExceptionH("Не число на месте элемента:" + (i +1) + "," + (j+1));
                }
            }
        }
        return sum;
    }


}
