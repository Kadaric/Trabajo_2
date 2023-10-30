public class FabricaHyundai extends FabricaCarros
{
    public static Radio fabricarRadio()
    {
        return new Radio();
    }
    
    public static Carro fabricarCarro(Radio radio)
    {
        return new Hyundai(radio);
    }
}
