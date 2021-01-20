package ru.geekbrains.homework.lesson2;

public class Main {
    static int SIZE = 4;

    public static void main(String[] args) {
        String[][] arr = {
                {"4", "8", "9", "5"},
                {"7", "8", "9", "1"},
                {"7", "2", "2", "3"},
                {"8", "9", "9", "1"}
        };
        String[][] arr1 = {
                {"4", "8", "9", "5"},
                {"7", "8f", "9", "1"},
                {"7", "2", "2", "3"},
                {"8", "9", "9", "1"}
        };
        String[][] arr2 = {
                {"4", "8", "9", "5"},
                {"7", "8", "9", "1"},
                {"7", "2", "2", "3"},
                {"8", "9", "9"}
        };
        try {
            System.out.println(sum(arr));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("size " + e.getSize());
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getRow() + " " + e.getCol());
            System.out.println(arr[e.getRow()][e.getCol()]);
        }
        try {
            System.out.println(sum(arr1));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("size " + e.getSize());
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getRow() + " " + e.getCol());
            System.out.println(arr1[e.getRow()][e.getCol()]);
        }
        try {
            System.out.println(sum(arr2));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("size " + e.getSize());
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getRow() + " " + e.getCol());
            System.out.println(arr2[e.getRow()][e.getCol()]);
        }

        System.out.println("end");
    }

    static int sum(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        if (arr.length != SIZE) {
            throw new MyArraySizeException("size " + arr.length, arr.length);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != SIZE) {
                throw new MyArraySizeException("size " + arr[i].length, arr[i].length);
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("format " + i + " " + j, i, j);
                }
            }
        }
        return sum;
    }
}

