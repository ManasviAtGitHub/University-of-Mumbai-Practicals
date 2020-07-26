using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using DifferentConsumer.ServiceReference1;
namespace DifferentConsumer
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        Temperature_InterfaceClient c = new Temperature_InterfaceClient();
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            

            String text = TextBox1.Text;
            Double val = Convert.ToDouble(text);
            Double result = c.celsius_to_farenheit(val);
            Label1.Text = Convert.ToString(result);


        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            String text = TextBox1.Text;
            Double val = Convert.ToDouble(text);
            Double result = c.farenheit_to_celsius(val);
            Label1.Text = Convert.ToString(result);
        }
    }
}