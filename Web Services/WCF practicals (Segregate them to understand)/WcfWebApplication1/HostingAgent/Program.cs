using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;
namespace HostingAgent
{
    class Program
    {
        static void Main(string[] args)
        {
            using (ServiceHost host = new ServiceHost(typeof(Wcf_Library.Calculator1)))
            {

                host.Open();
                Console.WriteLine("Hosting service at http://localhost:8888");
                Console.ReadLine();
            }
        }
    }
}
