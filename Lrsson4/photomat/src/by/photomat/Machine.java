package by.photomat;




public class Machine {

    Banknote[] bankNotes=new Banknote[0];

    public void countBankNotes(){ // количество банкнот (длина массива) и сумма (sum)
        int sum=0;
        for(int i=0; i<bankNotes.length;i++){
            sum+=bankNotes[i].amount;
        }
        System.out.println("Count: "+bankNotes.length+" total: "+sum);
    }

    public void acceptBankNotes(Banknote banknote) {
        Banknote[] newBanknotes = new Banknote[bankNotes.length+1];

        for(int i=0; i<bankNotes.length;i++){
            newBanknotes[i]=bankNotes[i];

        }
        newBanknotes[newBanknotes.length-1]=banknote;

        bankNotes=newBanknotes;

    }

    public void makePhoto() {

        char[][] photo = new char[9][12];
        for (int i=0;i<photo.length;i++){
            System.out.print("|");
            for(int j=0;j<photo[i].length;j++){
                photo[i][j] = 'O';
                System.out.print("("+i+","+j+")");
            }
            System.out.println("|");
        }
    }
}
