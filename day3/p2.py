
with open("input.txt", "r") as f:
    data = f.read()
    

final_data = ""

dont = data.split("don't()")

for index, chunk in enumerate(dont):
    print(index, chunk)
    if(index ==0):
        final_data+=chunk
        continue
        
    for index, chunk2 in enumerate(chunk.split("do()")):
        if(index>0):
            final_data+=chunk2



data = final_data.split("mul(")
total = 0
for part in data:
    if(")" in part):
        smaller = part.split(")")[0]
        print(smaller)
        
        if(smaller.count(",")==1):
            split = smaller.split(",")
            print(split)
            try:
                a = int(split[0])
                b = int(split[1])
                total += a*b
            except:
                print("invalid numbers")
                
print(total)