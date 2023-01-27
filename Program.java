package br.com.ada.polotech;

public class Program {
    public static void main(String[] args) {
        IphoneFactory factory = new ConcreteIphoneFactory();

        Iphone iphone9 = factory.CadastrarIphone(TypeIphoneEnum.IPHONE_9);
        iphone9.ExibixDetalhes();

        Iphone iphoneX = factory.CadastrarIphone(TypeIphoneEnum.IPHONE_X);
        iphoneX.ExibixDetalhes();

        Iphone iphone13Mini = factory.CadastrarIphone(TypeIphoneEnum.IPHONE_13_MINI);
        iphone13Mini.ExibixDetalhes();
    }
}
