using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace Wcf_Library
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Calculator1" in both code and config file together.
    public class Calculator1 : ICalculator1
    {
        public string add(int a, int b)
        {
            return string.Format("You entered: {0}", (a + b));
        }

        public void DoWork()
        {
        }

        public string multiply(int a, int b)
        {
            return string.Format("You entered: {0}", (a * b));
        }
    }
}
