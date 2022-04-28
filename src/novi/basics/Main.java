package novi.basics;

public class Main {

    public static void main(String[] args) {
	// An Array example
        String[] firstnames = {"Ilayda", "Talya", "Serkay", "Melisa", "Gamze"};

        firstnames [2] = "Seray";

        int firstnamesLength = firstnames.length;
        firstnames[firstnamesLength-1] = "Last name";

        System.out.println("De length of the array is: " + firstnamesLength);
        System.out.println(firstnames[0]);
        System.out.println(firstnames[1]);
        System.out.println(firstnames[2]);
        System.out.println(firstnames[3]);
        System.out.println(firstnames[4]);
    }
}

