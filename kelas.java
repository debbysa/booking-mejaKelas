import java.util.Scanner;

public class kelas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int siswa=1;
          String[][] meja = new String[2][2];
          String[] rekapNama = new String[4];

      do{
        System.out.println("__________________________________________");
        System.out.println("         WELCOME TO CLASS MI-1 E          ");
        System.out.println("__________________________________________");

        System.out.print("Inputkan Nama Anda : "); String nama=scan.next();

        int jam,menit;
        int jam_Masuk = 6;
        int menit_Masuk = 30;

        System.out.print("Jam hadir[1-23] : "); jam=scan.nextInt();
        System.out.print("Menit hadir[00-59] : "); menit=scan.nextInt();
        System.out.println("------------------------------------------");

        if(jam > jam_Masuk || menit > menit_Masuk && jam>=0 && jam<=23 && menit>=0 && menit<=59){
            System.out.println("Anda Terlambat!!");
            System.out.println("Kerjakan Kuis dulu, Baru boleh masuk kelas!");

            int poin=0;
            int jawab=0;

            do{
                System.out.println ("| Skor pertama anda adalah 0 (Nol)     |");
                System.out.println ("| Soal Terdiri dari 5 Soal             |");
                System.out.println ("| Jika jawaban  anda BENAR Bertambah 1 |");
                System.out.println ("| Jika jawaban  anda SALAH Dikurangi 1 |");
                System.out.println("------------------------------------------");
        
             System.out.print("1) 1 + 5 = ");
              jawab = scan.nextInt();
               
               if(jawab==6){
                System.out.println("jawaban anda benar");
                   System.out.print("poin anda adalah:");
                   System.out.println(poin+=1);
                }
             
               else {
                salah(poin);
                }
             
             System.out.print("2) 6 : 2 = ");
               jawab = scan.nextInt();
               if(jawab==3){
               System.out.println("jawaban anda benar");
                   System.out.print("poin anda adalah:");
                   System.out.println(poin+=1);
                }
             
               else {
                salah(poin);
                }
                
              System.out.print("3) 100 : 4 = ");
                  jawab = scan.nextInt();
                  if(jawab==25){
                  System.out.println("jawaban anda benar");
                  System.out.print("poin anda adalah:");
                  System.out.println(poin+=1);
                  }
  
                  else {
                    salah(poin);
                  }
                 
                 System.out.print("4) 9 x 5 = ");
                   jawab = scan.nextInt();
                   if(jawab==45){
                    System.out.println("jawaban anda benar");
                   System.out.print("poin anda adalah:");
                   System.out.println(poin+=1);
                    }
                 
                   else {
                    salah(poin);
                    }

                 System.out.print("5) 62 + 8 = ");
                   jawab = scan.nextInt();
                   if(jawab==70){
                    System.out.println("jawaban anda benar");
                   System.out.print("poin anda adalah:");
                   System.out.println(poin+=1);
                   }
                 
                   else {
                    salah(poin);
                    }

            }while(poin<=3);

            System.out.println("Horee!! Silahkan Masuk Kelas ===>>");
        }

          System.out.println("==========>>Pilih Tempat Duduk<<==========");
          tampilMeja(meja);
          System.out.println();

            //do{
              System.out.print("pilih Tempat Duduk[digit depan] : "); int d1= scan.nextInt();
              System.out.print("pilih Tempat Duduk[digit belakang] : "); int d2= scan.nextInt();

            tandaiBangku(d1,d2,nama,meja);
            //}
              
            tampilMeja(meja);
            System.out.println();
            
              //if(siswa<=4 && (jam>jam_Masuk || menit> menit_Masuk)){
                rekap(nama,jam,menit,rekapNama);
                 rekapTampil(rekapNama); 
              //}
              

        siswa++;
      }while(siswa<=4);
              
    }

    static void salah(int poin){
        System.out.println("jawaban anda salah");
          System.out.print("poin anda adalah:");
            if(poin==0){
              System.out.println(poin);   
            }else{
              System.out.println(poin-=1);
            }
    }

    static void tampilMeja(String[][] meja){
       //melihat meja yang ada
       System.out.println("------------------------------------------");
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[0].length; kol++){
              if(meja[bar][kol]!=null){ //jika meja pada baris dan kolom itu tidak kosong,   null=kosong
                System.out.print("| "+meja[bar][kol]+" |"); //tampilkan isi array meja di index bar dan kolom
              }
              else{
                System.out.print("| "+bar+","+kol+" |");
              }
            }
            System.out.println();
        }
        System.out.println("------------------------------------------"); 
    }

    // Siswa menandai bangku
     static void tandaiBangku(int d1, int d2, String nama,String[][] meja) {
        if(d1>=0 && d1<2 && d2>=0 && d2<2){
          //boolean status=true;

          if(meja[d1][d2]==null){
            meja[d1][d2]=nama;
          }
          else{
            //status=false;
            System.out.println("Maaf! Bangku sudah diisi! Silahkan pilih yang lain..");
          }
        }
        else{
          System.out.println("Digit tidak tersedia!");
        }
      }//Akhir method tandaiBangku

      //Rekap jam dan menit siswa yang datang
      static void rekap(String nama, int jam, int menit, String[] rekapNama){
        int batas_Jam =6;
        int batas_menit = 30; 
        int[][] arr = new int[4][4];

        if(jam> batas_Jam || menit> batas_menit){

              int jam_Max = arr[0][0];
              for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                  arr[i][j]=jam;
                  if(arr[i][j] >= jam_Max){
                     System.out.println(arr[i][j]);
                    if(arr[i][j]==0){
                      jam_Max=arr[i][j];
                       System.out.println(arr[i][j]);      
                    }
                  
                  }
                }
              }

              int menit_Max = arr[0][0];
              for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                  arr[i][j]=menit;
                  if(arr[i][j] >= menit_Max){
                     System.out.println(arr[i][j]);
                    if(arr[i][j]==0){
                        menit_Max=arr[i][j];  
                        System.out.println(arr[i][j]);
                    }
                  
                  }
                }
              }

              
              for(int i=0; i<rekapNama.length; i++){
                if(jam== jam_Max || menit== menit_Max){
                  if(rekapNama[i]==null && jam> batas_Jam || menit> batas_menit){
                      rekapNama[i]=nama;
                      break;
                  
                  }
                
              }
              
            }

        }
        
        
            
      }// akhir fungsi rekap

      static void rekapTampil(String[] rekapNama){
        System.out.println("------------------------------------------");
        System.out.println("Nama siswa yang telat :");
         for(int bar=0; bar< rekapNama.length;bar++){
            if(rekapNama[bar] != null){
               
              System.out.println(rekapNama[bar]);
            }

        }
        System.out.println("------------------------------------------");
      }
}