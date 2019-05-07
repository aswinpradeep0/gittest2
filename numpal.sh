read n1
n2=$n1
while [ $n1 -gt "0" ]
do
	rem=$((n1%10))
	rev=$((rev*10+rem))
	n1=$((n1/10))
done

if [ $rev -eq $n2 ]
	then echo "palindrome"
else
	echo "not palindrome"
fi

