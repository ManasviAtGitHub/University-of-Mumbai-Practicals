using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebClient
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            Wcf_For_WebClient.Service1Client service1 = new Wcf_For_WebClient.Service1Client("BasicHttpBinding_IService1");
            Label1.Text = service1.GetData(Convert.ToInt32(TextBox1.Text));
        }
    }
}