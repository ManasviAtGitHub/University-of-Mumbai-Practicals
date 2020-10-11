using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsClient
{
    public partial class Form1 : Form
    {
 

        public Form1()
        {
            InitializeComponent();
        }

        private void Button1_Click(object sender, EventArgs e)
        {

            Wcf_Form_Client.Service1Client service1 = new Wcf_Form_Client.Service1Client("NetTcpBinding_IService1");
            label1.Text = service1.GetData(Convert.ToInt32(textBox1.Text));
           
            Wcf_Form_Client.CompositeType composite1 = new Wcf_Form_Client.CompositeType();
            composite1.BoolValue = true;
            composite1.StringValue = "Its the year";

            Wcf_Form_Client.CompositeType composite2 = new Wcf_Form_Client.CompositeType();
            composite2 = service1.GetDataUsingDataContract(composite1);
            label1.Text = composite2.StringValue;

        }
    }
}
