public abstract class Carro 
{
    private Radio radioDelCarro;
    Carro(Radio x)
    {
        radioDelCarro=x;
    }
    
    public abstract void acelerar();
}
