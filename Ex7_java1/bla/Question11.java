package bla;

public class Question11 {
    public static void main(String[] args) {
        Bank sbi = new SBI("shahdara","SHAH23");
        Bank boi = new BOI("Rohini","ROH345");
        Bank icici = new ICICI("Saket","SAK123");

        sbi.getDetails();
        System.out.println();
        boi.getDetails();
        System.out.println();
        icici.getDetails();
    }
}

    class Bank{
        String branchName;
        String IFSC;
        double rateOfInterest;
        String bankName;

        Bank(){
            branchName = "";
            IFSC = "";
            rateOfInterest = 0.0;
            bankName = "";
        }

        public void getDetails(){

        }
    }

    class SBI extends Bank{
        SBI(){

        }
        SBI(String branchName,String IFSC){
            this.branchName = branchName;
            this.IFSC = IFSC;
            this.rateOfInterest = 6.9;
            this.bankName = "State Bank of India";
        }

        public void getDetails(){
            System.out.println("Branch name : "+this.branchName);
            System.out.println("Bank name : "+this.bankName);
            System.out.println("IFSC code : "+this.IFSC);
            System.out.println("Rate of Interest : "+this.rateOfInterest+"%");
        }
    }
    class BOI extends Bank{
        BOI(){

        }
        BOI(String branchName,String IFSC){
            this.branchName = branchName;
            this.IFSC = IFSC;
            this.rateOfInterest = 5.9;
            this.bankName = "Bank Of India";
        }

        public void getDetails(){
            System.out.println("Branch name : "+this.branchName);
            System.out.println("Bank name : "+this.bankName);
            System.out.println("IFSC code : "+this.IFSC);
            System.out.println("Rate of Interest : "+this.rateOfInterest+"%");
        }
    }


    class ICICI extends Bank{
        ICICI(){

        }
        ICICI(String branchName,String IFSC){
            this.branchName = branchName;
            this.IFSC = IFSC;
            this.rateOfInterest = 7.6;
            this.bankName = "ICICI";
        }

        public void getDetails(){
            System.out.println("Branch name : "+this.branchName);
            System.out.println("Bank name : "+this.bankName);
            System.out.println("IFSC code : "+this.IFSC);
            System.out.println("Rate of Interest : "+this.rateOfInterest+"%");
        }
    }



