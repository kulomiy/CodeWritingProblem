package condition2;

public class NestedSwitch {
    // Method menu pilihan bersarang
    public String getSelection(int category, int choice) {
        switch (category) {
            case 1: // Ketegori minuman
                switch (choice) {
                    case 1: return "1, You selected: Tea";      // Pilihan 1 = Teh
                    case 2: return "1, You selected: Coffee";   // Pilihan 2 = Kopi
                    default: return "1, Invalid drink choice";  // Pilihan tidak valid
                }
            case 2: // Kategori makanan
                switch (choice) { 
                    case 1: return "2, You selected: Pizza";    // Pilihan 1 = Pizza
                    case 2: return "2, You selected: Burger";   // Pilihan 2 = Burger
                    default: return "2, Invalid food choice";   // Tidak valid
                }
            default: // Jika ketegori tidak dikeanl
                return category + ", Invalid category";
        }
    }
}
