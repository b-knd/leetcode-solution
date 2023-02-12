
#one line pipe solution: cat words.txt | tr -s ' ' '\n' | sort | uniq --count | sort -r | awk '{print $2 " " $1}'

#!/bin/bash

file=$(cat words.txt | tr '\n' ' ') 
read -a arr <<< $file

declare -a hashtable

#increment value if word existed in hashtable, otherwise initialise
for j in "${arr[@]}"; do
  if [[ "${hashtable[$j]+abc}" ]]; then
    hashtable[$j]=$((${hashtable[$j]} + 1))
  else
    hashtable[$j]=1
  fi
done

#sorting and displaying
for k in "${!hashtable[@]}";
do
  echo "$k ${hashtable[$k]}"
done
