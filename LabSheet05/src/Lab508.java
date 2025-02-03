import java.util.Scanner;

public class Lab508 {
	public static void main(String[] args) {
        int[] nums = {25, 78, 41, 22, 36, 85, 37}; // ประกาศอาร์เรย์
        Scanner scanner = new Scanner(System.in);
        int index;

        // รับตำแหน่งอาร์เรย์จากผู้ใช้ และตรวจสอบความถูกต้อง
        while (true) {
            System.out.print("Enter array index (0 to " + (nums.length - 1) + "): ");
            index = scanner.nextInt();

            // เรียกใช้ checkIndex() เพื่อตรวจสอบตำแหน่ง
            if (checkIndex(nums, index)) {
                break; // ออกจากลูปหากตำแหน่งถูกต้อง
            } else {
                System.out.println("Invalid index. Please try again.");
            }
        } //end while

        // แสดงผลข้อมูลตำแหน่งปัจจุบัน ก่อนหน้า และถัดไป
        System.out.println("Current data: nums[" + index + "] is " + currentData(nums, index));

        if (index > 0) {
            System.out.println("Previous data: nums[" + (index - 1) + "] is " + prevData(nums, index));
        } else {
            System.out.println("No previous data.");
        }

        if (index < nums.length - 1) {
            System.out.println("Next data: nums[" + (index + 1) + "] is " + nextData(nums, index));
        } else {
            System.out.println("No next data.");
        }
    }

    // Method: ตรวจสอบว่าตำแหน่งในอาร์เรย์ถูกต้องหรือไม่
    public static boolean checkIndex(int[] nums, int index) {
        return index >= 0 && index < nums.length;
    }

    // Method: คืนค่าข้อมูลในตำแหน่งปัจจุบัน
    public static int currentData(int[] nums, int index) {
        return nums[index];
    }

    // Method: คืนค่าข้อมูลในตำแหน่งก่อนหน้า
    public static int prevData(int[] nums, int index) {
        return nums[index - 1];
    }

    // Method: คืนค่าข้อมูลในตำแหน่งถัดไป
    public static int nextData(int[] nums, int index) {
        return nums[index + 1];
    }


}
