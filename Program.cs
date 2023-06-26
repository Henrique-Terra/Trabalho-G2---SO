using System;
using System.Net.NetworkInformation;

public class Program
{
    public static void Main(string[] args)
    {
        if (NetworkInterface.GetIsNetworkAvailable())
        {
            Console.WriteLine("Conexão com a Internet está ativa.");
        }
        else
        {
            Console.WriteLine("Sem conexão com a Internet.");
        }
    }
}

