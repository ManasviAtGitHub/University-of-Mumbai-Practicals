using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;

namespace HostingWcf
{
    class Program
    {
        static void Main(string[] args)
        {
            using (ServiceHost host = new ServiceHost(typeof(Wcf_Scratch.Calculator))) {

                host.Open();
                Console.WriteLine("Hosting service at http://localhost:8080");
                Console.ReadLine();
            }

        }
    }
}
