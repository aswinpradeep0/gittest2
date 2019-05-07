import java.net.*;
import java.io.*;
class server
{
	public static void main(String args[])throws Exception
	{
		String str="",str2="";
		ServerSocket ss=new ServerSocket(3333);
		Socket s=ss.accept();
		System.out.println("connected,chat now");
		//System.out.println("connection established,chat now");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		while(!str.equals("stop"))
		{
			dout.flush();
			str=din.readUTF();
			System.out.println("client says:"+str);


			str2=br.readLine();
			dout.writeUTF(str2);

		}
		din.close();
		s.close();
		ss.close();
	}
}
