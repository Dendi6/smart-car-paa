/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPAA;

/**
 *
 * @author tekad_000
 */
public class MyAlgorithm extends matulatan.matrixmap.Algorithm{

    /*
        Disini kalian membuat algoritma smart car (segitiga merah)
        yang dapat menemukan destinasi (bendera merah) dalam matrix ukuran
        20 x 20 (baris x kolom).
        Variabel yang dapat digunakan adalah
        destRow = baris lokasi bendera (bilangan integer)
        destCol = kolom lokasi bendera (bilangan integer)

        Konstanta mata angin yang dapat digunakan adalah
        NORTH   = arah utara (sebelah atas)
        EAST    = arah timur (sebelah kanan)
        SOUTH   = arah selatan (sebelah bawah)
        WEST    = arah barat (sebelah kiri)

        Konstanta arah pandangan yang dapat digunakan adalah
        AHEAD   = depan (tergantung posisi mobil mengarah ke mata angin yang mana)
        LEFT    = kiri (tergantung posisi mobil mengarah ke mata angin yang mana)
        RIGHT   = kanan (tergantung posisi mobil mengarah ke mata angin yang mana)
        BEHIND  = belakang (tergantung posisi mobil mengarah ke mata angin yang mana)

        Sementara obyek yang bisa digunakan adalah
        car     = obyek mobil berbentuk segitiga merah sama sisi dengan sudut lancip
                  sebagai ujung depan dari mobil
        Adapun method yang bisa di gunakan oleh car adalah
        headed()    = menghasilkan arah mata angin dimana mobil mengarah;
            contoh:
            if ( car.headed() == NORTH ){
            }
            atau
            switch ( car.headed() ){
                case NORTH:
                case EAST:
                case SOUTH:
                case WEST:
                }
        getRowPosition() = menghasilkan baris posisi mobil saat ini (bilangan integer)
            contoh:
            if (car.getRowPosition() < destRow) { }
        getColPosition() = menghasilkan kolom posisi mobil saat ini (bilangan integer)
            contoh:
            if (car.getColPosition() < destCol){ }
        forward()       = menyebabkan mobil maju ke depan 1 kotak. Apabila mobil
                          tidak dapat maju di akibatkan terhalang maka menghasilkan false.
                          Apabila mobil berhasil maju 1 kotak maka menghasilkan true.
            contoh:
            car.forward();
            atau
            if ( !car.forward ) {}
        turnLeft()      = menyebabkan mobil berputar ke kiri 90° pada posisinya. Sehingga
                          mobil berubah arah mata angin
            contoh:
            car.turnLeft();
        turnRight()     = menyebabkan mobil berputar ke kanan 90° pada posisinya. Sehingga
                          mobil berubah arah mata angin
            contoh:
            car.turnRight();
        sensing( arah pandangan ) = mengecek pada arah pandangan apakah bebas atau
                          terhalang untuk dapat di lalui oleh mobil
        contoh:
            if (car.sensing( AHEAD ))
                car.forward();
            else if (car.sensing( LEFT ))
                car.turnLeft();

        Selanjutnya keyword yang dapat digunakan adalah sesuai dengan bahasa Java seperti
        if ... else if ... else
        switch .... case

        Tanda operator yang bisa digunakan adalah sesuai dengan bahasa Java seperti
        > , < , <= , >= , == , != , && (operator dan), || (operator atau )

        Selamat Berjuang !!!
        Jangan lupa cuci muka pakai sabun dan jaga kesehatan !!!

        */
    @Override
    public boolean running(){
        if (car != null){
/*
 ******   MULAI TULIS ALGORITMA KALIAN DISINI   ****************
   */
            int startX= car.getColPosition();
            int startY = car.getRowPosition();

            if (startX == destRow && startY == destCol) {
                return false; // Mobil sudah mencapai bendera
            }
            else {
                if (car.headed()==NORTH){
                    if ( startX < destCol && startY < destRow){
                        if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(BEHIND)) {
                            car.turnRight();
                        }
                    }
                    else if ( startX < destCol && startY > destRow){
                        if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(LEFT)){
                            car.turnLeft();
                        } else if (car.sensing(BEHIND)) {
                            car.turnRight();
                        }
                    }
                    else if ( startX < destCol && startY == destRow){
                        if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(BEHIND)) {
                            car.turnRight();
                        }
                    }
                    else if ( startX > destCol && startY < destRow) {
                        if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(BEHIND)) {
                            car.turnRight();
                        }
                    }
                    else if ( startX > destCol && startY > destRow) {
                        if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(BEHIND)) {
                            car.turnLeft();
                        }
                    }
                    else if ( startX > destCol && startY == destRow) {
                        if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)){
                            car.turnRight();
                        } else if (car.sensing(BEHIND)){
                            car.turnLeft();
                        }
                    }
                    else if ( startX == destCol && startY < destRow) {
                        if (car.sensing(BEHIND)) {
                            if (car.sensing(RIGHT)){
                                car.turnRight();
                            } else if (car.sensing(LEFT)){
                                car.turnLeft();
                            } else {
                                car.forward();
                            }
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        }
                    }
                    else if ( startX == destCol && startY > destRow) {
                        if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(LEFT)){
                            car.turnLeft();
                        } else if (car.sensing(BEHIND)){
                            car.turnRight();
                        }
                    }
                } else if(car.headed()==EAST){
                    if ( startX < destCol && startY < destRow){
                        if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(BEHIND)){
                            car.turnRight();
                        }
                    }
                    else if ( startX < destCol && startY > destRow){
                        if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(BEHIND)){
                            car.turnLeft();
                        }
                    }
                    else if ( startX < destCol && startY == destRow){
                        if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)){
                            car.turnRight();
                        } else if (car.sensing(BEHIND)){
                            car.turnLeft();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        }
                    }
                    else if ( startX > destCol && startY < destRow) {
                        if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(BEHIND)) {
                            car.turnRight();
                        }
                    }
                    else if ( startX > destCol && startY > destRow) {
                        if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(BEHIND)){
                            car.turnLeft();
                        }
                    }
                    else if ( startX > destCol && startY == destRow) {
                        if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        }
                    }
                    else if ( startX == destCol && startY < destRow) {
                        if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else {
                            car.turnRight();
                        }
                    }
                    else if ( startX == destCol && startY > destRow) {
                        if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(BEHIND)){
                            car.turnLeft();
                        }
                    }
                } else if (car.headed()==SOUTH){
                    if ( startX < destCol && startY < destRow){
                        if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)){
                            car.turnLeft();
                        } else if (car.sensing(RIGHT)){
                            car.turnRight();
                        } else if (car.sensing(BEHIND)){
                            car.turnRight();
                        }
                    }
                    else if ( startX < destCol && startY > destRow){
                        if (car.sensing(LEFT)){
                            car.turnLeft();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        }  else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(BEHIND)){
                            car.turnRight();
                        }
                    }
                    else if ( startX < destCol && startY == destRow){
                        if (car.sensing(LEFT)){
                            car.turnLeft();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else {
                            car.turnRight();
                        }
                    }
                    else if ( startX > destCol && startY < destRow) {
                        if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(BEHIND)) {
                            car.turnLeft();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        }
                    }
                    else if ( startX > destCol && startY > destRow) {
                        if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(BEHIND)){
                            car.turnRight();
                        }
                    }
                    else if ( startX > destCol && startY == destRow) {
                        if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(BEHIND)){
                            car.turnRight();
                        }
                    }
                    else if ( startX == destCol && startY < destRow) {
                        if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(LEFT)){
                            car.turnLeft();
                        } else if (car.sensing(BEHIND)){
                            car.turnRight();
                        }
                    }
                    else if ( startX == destCol && startY > destRow) {
                        if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(BEHIND)) {
                            car.turnRight();
                        }
                    }
                } else if (car.headed()==WEST){
                    if ( startX < destCol && startY < destRow){
                        if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else {
                            car.turnRight();
                        }
                    }
                    else if ( startX < destCol && startY > destRow){
                        if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else {
                            car.turnRight();
                        }
                    }
                    else if ( startX < destCol && startY == destRow){
                        if (car.sensing(AHEAD) && car.sensing(LEFT) && car.sensing(BEHIND)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(AHEAD)){
                            car.forward();
                        } else if (car.sensing(BEHIND)) {
                            car.turnLeft();
                        }
                    }
                    else if ( startX > destCol && startY < destRow) {
                        if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)){
                            car.turnLeft();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(BEHIND)){
                            car.turnLeft();
                        }
                    }
                    else if ( startX > destCol && startY > destRow) {
                        if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)){
                            car.turnLeft();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else {
                            car.turnLeft();
                        }
                    }
                    else if ( startX > destCol && startY == destRow) {
                        if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)){
                            car.turnLeft();
                        } else if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(BEHIND)){
                            car.turnLeft();
                        }
                    }
                    else if ( startX == destCol && startY < destRow) {
                        if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(RIGHT)){
                            car.turnRight();
                        } else if (car.sensing(BEHIND)){
                            car.turnRight();
                        }
                    }
                    else if ( startX == destCol && startY > destRow) {
                        if (car.sensing(RIGHT)) {
                            car.turnRight();
                        } else if (car.sensing(AHEAD)) {
                            car.forward();
                        } else if (car.sensing(LEFT)) {
                            car.turnLeft();
                        } else if (car.sensing(BEHIND)){
                            car.turnRight();
                        }
                    }
                }
            }
// ANDA TIDAK HARUS BUAT SEPERTI ITU... BEBAS
// ANDA BOLEH BERKREASI DENGAN PETUNJUK YANG SUDAH DIBERIKAN

























































































            return true;
        }
        return false;
    }
}
