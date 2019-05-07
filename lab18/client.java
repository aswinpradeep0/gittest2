import java.net.*;
import java.io.*;
class client
{
	public static void main(String args[])throws Exception
	{
		String str="",str2="";
		Socket s=new Socket("localhost",3333);
		System.out.println("connection established,chat now");

		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(!str.equals("stop"))
		{
			str=br.readLine();
			dout.writeUTF(str);
			dout.flush();
			str2=din.readUTF();
			System.out.println("server says:"+str2);
		}
		dout.close();
		s.close();
	}
}
