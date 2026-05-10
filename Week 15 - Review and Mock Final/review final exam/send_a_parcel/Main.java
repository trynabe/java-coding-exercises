    package send_a_parcel;

    public class Main {
        public static void main(String[] args) {
            Billable[] parcels = new Billable[3];

            String[] services = {"EMSService", "FlashService", "EMSService"};
            double[] weight = {2.0, 2.0, -3.0};

            for (int i = 0; i < weight.length; i++) {
                try {
                    if (services[i].equals("EMSService")) {
                        parcels[i] = new EMSService("EMSService", weight[i]);
                    } else if (services[i].equals("FlashService")) {
                        parcels[i] = new FlashService("FlashService", weight[i]);
                    }

                    ParcelService serviceDetails = (ParcelService) parcels[i];
                    System.out.println(serviceDetails.serviceName + ": " + serviceDetails.weightInKg + " kg -> " + parcels[i].calculateBill() + " Baht");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }