
with open("input.txt", "r") as f:
    data = f.read()
    

data = data.split("mul(")
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