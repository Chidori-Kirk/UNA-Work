public class ProcessLargeDataset {
    public static void main (String [] args) {
        double sumAssistant = 0;
        double sumAssociate = 0;
        double sumFull = 0;
        double sumAll = 0;
         
        int countAssistant = 0;
        int countAssociate = 0;
        int countFull = 0;
         
        try {
            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Salary.txt");
         
            java.util.Scanner input = new java.util.Scanner(url.openStream());
             
            while(input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
                String[] myString = line.split(" ");
                if(myString[2].equals("assistant")) {
                    sumAssistant += Double.parseDouble(myString[3]);
                    countAssistant++;
                }
                
                else if(myString[2].equals("associate")) {
                    sumAssociate += Double.parseDouble(myString[3]);
                    countAssociate++;
                }
                
                else if(myString[2].equals("full")) {
                    sumFull += Double.parseDouble(myString[3]);
                    countFull++;
                }
            }
        }
        catch (java.net.MalformedURLException e){ 
            System.out.println("Invalid URL");
        }
        catch (java.io.IOException e) {
            System.out.println("I/O Errors: no such file");
        }
         
        System.out.println("\nData were retrieved from http://cs.armstrong.edu/liang/data/Salary.txt\n");
        System.out.printf("Total salary for assistant professors is $%,.2f\n",sumAssistant);
        System.out.printf("Total salary for associate professors is $%,.2f\n",sumAssociate);
        System.out.printf("Total salary for full professors is $%,.2f\n",sumAssociate);
        System.out.printf("Total salary for all professors is $%,.2f\n",sumFull + sumAssociate + sumAssistant);
        System.out.printf("\nAverage salary for assistant professors is $%,.2f\n",sumAssistant/countAssistant);
        System.out.printf("Average salary for associate professors is $%,.2f\n", sumAssociate/countAssociate);
        System.out.printf("Average salary for full professors is $%,.2f\n", sumFull/countFull);
        System.out.printf("Average salary for all professors is $%,.2f", (sumAssistant/countAssistant + sumAssociate/countAssociate + sumFull/countFull)/3);
    }
}