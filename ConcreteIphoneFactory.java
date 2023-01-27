package br.com.ada.polotech;

public class ConcreteIphoneFactory extends IphoneFactory {
    @Override
    public Iphone CadastrarIphone(TypeIphoneEnum tipoIphone) {
        switch (tipoIphone) {
            case IPHONE_X:
                return new IphoneX();
            case IPHONE_9:
                return new Iphone9();
            case IPHONE_13_MINI:
                return new Iphone13Mini();
            default:
                System.out.println("Iphone não pode ser criado.");
                return null;
        }
    }
}
