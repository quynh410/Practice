import java.util.Scanner;

public class Crud_Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int size = 0;

        while (true) {
            System.out.println("\nChon thao tac:");
            System.out.println("1. Them phan tu");
            System.out.println("2. Hien thi mang");
            System.out.println("3. Cap nhat phan tu");
            System.out.println("4. Xoa phan tu");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Nhap so luong phan tu can them: ");
                    int numToAdd = scanner.nextInt();

                    if (size + numToAdd > array.length) {
                        System.out.println("Khong du cho trong mang! Chi co the them toi da " + (array.length - size) + " phan tu.");
                    } else {
                        System.out.println("Nhap cac phan tu:");
                        for (int i = 0; i < numToAdd; i++) {
                            System.out.print("Arr[" + (size + i) + "] = ");
                            array[size + i] = scanner.nextInt();
                        }
                        size += numToAdd;
                        System.out.println("Da them thanh cong " + numToAdd + " phan tu.");
                    }
                    break;
                case 2:
                    System.out.print("Arr[] = ");
                    if (size == 0) {
                        System.out.println("{}");
                    } else {
                        System.out.print("{ ");
                        for (int i = 0; i < size; i++) {
                            System.out.print(array[i]);
                            if (i < size - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println(" }");
                    }
                    break;

                case 3:
                    System.out.print("Nhap vi tri can cap nhat (0 den " + (size - 1) + "): ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < size) {
                        System.out.print("Nhap gia tri moi: ");
                        array[index] = scanner.nextInt();
                        System.out.println("Cap nhat thanh cong.");
                    } else {
                        System.out.println("Vi tri khong hop le!");
                    }
                    break;

                case 4:
                    System.out.print("Nhap vi tri can xoa (0 den " + (size - 1) + "): ");
                    int deleteIndex = scanner.nextInt();
                    if (deleteIndex >= 0 && deleteIndex < size) {
                        for (int i = deleteIndex; i < size - 1; i++) {
                            array[i] = array[i + 1];
                        }
                        size--;
                        System.out.println("Xoa thanh cong.");
                    } else {
                        System.out.println("Vi tri khong hop le!");
                    }
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le! Vui long nhap lai.");
                    break;
            }
        }
    }
}
