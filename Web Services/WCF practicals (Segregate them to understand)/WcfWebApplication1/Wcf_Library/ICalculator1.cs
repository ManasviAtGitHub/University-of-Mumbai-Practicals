using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace Wcf_Library
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "ICalculator1" in both code and config file together.
    [ServiceContract]
    public interface ICalculator1
    {
        [OperationContract]
        void DoWork();

        [OperationContract]
        string add(int a, int b);

        [OperationContract]
        string multiply(int a, int b);
    }
}
