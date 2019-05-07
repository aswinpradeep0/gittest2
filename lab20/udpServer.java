import java.net.*;
import java.io.*;
class udpServer
{
	public static void main(String args[])throws Exception
	{
		String str="";

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DatagramSocket serverSocket=new DatagramSocket(9876);
		byte[] sendData=new byte[1024];
		byte[] receiveData=new byte[1024];
		
		while(!str.equals("stop"))
		{
			DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
			serverSocket.receive(receivePacket);
			String str2=new String(receivePacket.getData());
			System.out.println("client says="+str2);

			InetAddress IPAddress=receivePacket.getAddress();
			int port=receivePacket.getPort();


			str=br.readLine();
			sendData=str.getBytes();
			DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress,port);
			serverSocket.send(sendPacket);
			
		}
		//serverSocket.close();
	}
}
