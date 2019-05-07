read n1
read n2
read c
while [ $c -lt "5" ]
do
if [ $c -eq "1" ]
then echo "sum=" $((n1+n2))
fi

if [ $c -eq "2" ]
then 

echo `echo "scale=2; $n1/$n2"|bc`
fi
read c
done
