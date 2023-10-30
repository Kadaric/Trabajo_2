public class FabricaFerrari extends FabricaCarros 
{
    public static Radio fabricarRadio(String marca)
    {
        return new Radio();
    }
    
    public static Carro fabricarCarro(Radio radio)
    {
        return new Ferrari(radio);
    }
}