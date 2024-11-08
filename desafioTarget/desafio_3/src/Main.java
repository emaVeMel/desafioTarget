public class Main {
    public static void main(String[] args) {
        double[] invoicing = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};

        double minimumInvoice = invoicing[0];
        for (double in : invoicing) {
            if (in > 0.0 && in < minimumInvoice) {
                minimumInvoice = in;
            }
        }

        double maximumInvoice = invoicing[0];
        for (double in : invoicing) {
            if (in > 0.0 && in > maximumInvoice) {
                maximumInvoice = in;
            }
        }

        int invoiceCounter = 0;
        double invoiceMedia = 0.0;
        int notAHoliday = 0;

        for (double in : invoicing) {
            if (in > 0.0) {
                invoiceMedia += in;
                notAHoliday++;
            }
        }

        invoiceMedia = invoiceMedia / notAHoliday;

        for (double in : invoicing) {
            if (in > 0.0 && in > invoiceMedia) {
                invoiceCounter++;
            }
        }


        System.out.println("The lowest invoice value during the month is " + minimumInvoice);
        System.out.println("The highest invoice value during the month is " + maximumInvoice);
        System.out.println("The number of days that the invoicing of the day is bigger than the media is " + invoiceCounter);
    }
}