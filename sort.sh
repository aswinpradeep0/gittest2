echo "enter limit"
read n
echo "enter array elements"
for (( i=0; i<$n ; i++ ))
do
	read a[i]
done
echo "the entered array elements are="
for (( i=0; i<$n ; i++ ))
do
	echo ${a[i]}
done

for(( i=0; i<$n; i++ ))
do
	for(( j=0; j<$n-1; j++ ))
	do
		if [ ${a[$j]} -gt ${a[$j+1]} ] 
		then
			t=${a[$j]}
			a[$j]=${a[$j+1]}
			a[$j+1]=$t
		fi
	done
done
echo "the sorted array elements are="
for (( i=0; i<$n ; i++ ))
do
	echo ${a[i]}
done
