f = open("laws_office.txt", "r")
laws_list = []
for x in f:
  if (len(x) > 1):
    laws_list.append(x)

i = 1
with open(r'./test.txt', 'w') as fp:
  for x in laws_list:
    length = int(len(x)/2)
    print(x[:length])
    fp.write("%s\n" % x[:length])
    if i%5 == 0:
      fp.write("\n")
    i += 1
