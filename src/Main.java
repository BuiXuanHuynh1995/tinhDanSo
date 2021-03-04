public class Main {
    public static void main(String[] args) {
        int soGiayTreSinhRa = 7;
        int soGiayNguoiQuaDoi = 13;
        int soGiayNguoiNhapCu = 45;
        double danSoHienTai = 312032486;
        int soGiayTrongNam = 365*24*60*60;

        //Số dân = Số lượng trẻ em sinh ra + Số người nhập cư - Số người qua đời.
        double soTreEmDuocSinh = (double) soGiayTrongNam/soGiayTreSinhRa;
        double soNguoiQUaDoi = (double) soGiayTrongNam/soGiayNguoiQuaDoi;
        double soNguoiNhapCu =(double) soGiayTrongNam/soGiayNguoiNhapCu;

        // tính dân số Hoa Kỳ trong 5 năm tiếp theo
        // hiển thị số dân của từng năm
        for(int i=1;i<=5;i++){
            danSoHienTai += soTreEmDuocSinh+soNguoiNhapCu-soNguoiQUaDoi;
            System.out.println("Số dân hiện tại của năm thứ "+i+" là: "+ (int)danSoHienTai);
        }
    }
}
