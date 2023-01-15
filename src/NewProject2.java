
public class NewProject2 {
    public static void main(String[] args) {

        int phoneAmount = 100;
        int phoneRecharge = 500;
        if (phoneRecharge < 1000) {
            phoneAmount = phoneAmount + phoneRecharge;
        } else {
            phoneAmount = phoneAmount + phoneRecharge + phoneRecharge / 100;
        }
        System.out.println("Итоговый баланс:" + phoneAmount);
    }
}