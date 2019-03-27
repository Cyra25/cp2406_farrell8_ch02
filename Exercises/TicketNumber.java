import javax.swing.JOptionPane;

public class TicketNumber {
    public static void main(String[] args) {
        String message;
        int ticketNum, sixDigit, seventhDigit, remainder;
        boolean valid;
        message = JOptionPane.showInputDialog(null, "Enter the ticket number; for example, 123454", "ticket Number", JOptionPane.INFORMATION_MESSAGE);
        ticketNum = Integer.parseInt(message);
        sixDigit = ticketNum / 10;
        seventhDigit = ticketNum % 10;
        remainder = sixDigit % 7;
        valid = (seventhDigit == remainder);
        if (valid){
            JOptionPane.showMessageDialog(null, "Your ticket number is valid");
        }
        else {
            JOptionPane.showMessageDialog(null, "Your ticket number is not valid");
        }


    }
}
