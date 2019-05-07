echo "Enter No. of Elements : "
read limit
echo "Enter Numbers"
n=1
while [ $n -le $limit ]
do
read num
a[n]=$num
n=`expr $n + 1`
done
for((i=1;i<n;i++))
do
for((j=0;j<n-i;j++))
do
if[ ${a[$j]} -gt ${a[$j+1]} ] 
then
t=${a[$j]}
a[$j]=${a[$j+1]}
a[$j+1]=$t
fi
done
done
n=1
while [ $n -le $limit ]
do
echo ${a[$n]}
n=`expr $n + 1`
done








echo "Enter No. of Elements : "
read limit
echo "Enter Numbers"
n=1
while [ $n -le $limit ]
do
read num
eval arr$n=$num
n=`expr $n + 1`
done
for((i=1;i<limit;i++))
do
for((j=0;j<limit-i;j++))
do
if [ ${arr[$j]} -gt ${arr[$j+1]} ]; then
t=${arr[$j]}
arr[$j]=${arr[$j+1]}
arr[$j+1]=$t
fi
done
done
n=1
while [ $n -le $limit ]
do
num=${arr[$n]}
echo "$num"
n=`expr $n + 1`
done
echo "Enter Element to be searched"
read key
low=1
high=$n
found=0
while [ $found -eq 0 -a $high -gt $low ]
do
mid=`expr \( $low + $high \) / 2`
eval t=\$arr$mid
if [ $key -eq $t ]
then
found=1
elif [ $key -lt $t ]
then
high=`expr $mid - 1`
else
low=`expr $mid + 1`
fi
done
if [ $found -eq 0 ]
then
echo "Element Not Found"
else
echo "Element Found at $mid"
fi
