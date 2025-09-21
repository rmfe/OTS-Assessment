import java.util.ArrayList;
import java.util.List;

class Drug {
    long drug_id;           
    String code;
    String name;
    double price;
    int stock;
    long drug_category_id;  

public class Main {
    // Προβολή όλων των φαρμάκων 
    static void printAllDrugs(List<Drug> drugs) {
        System.out.println("drug_id code name price stock drug_category_id");
        for (Drug d : drugs) {
            System.out.println(d.drug_id + " " + d.code + " " + d.name + " " + d.price + " " + d.stock + " " + d.drug_category_id);
        }
    }

    public static void main(String[] args) {
        List<Drug> drugs = new ArrayList<>();
        long next_drug_id = 1;        
        long antibiotics_id = 1;      

        // δημιουργία νέων φαρμάκων, ως απλά αντικείμενα
        Drug d1 = new Drug();
        d1.drug_id = next_drug_id++;
        d1.code = "ABX-001";
        d1.name = "Amoxicillin 500mg";
        d1.price = 2.40;
        d1.stock = 100;
        d1.drug_category_id = antibiotics_id;
        drugs.add(d1);

        Drug d2 = new Drug();
        d2.drug_id = next_drug_id++;
        d2.code = "PNK-010";
        d2.name = "Paracetamol 500mg";
        d2.price = 0.12;
        d2.stock = 500;
        d2.drug_category_id = antibiotics_id;
        drugs.add(d2);

        
        printAllDrugs(drugs);
    }
}
