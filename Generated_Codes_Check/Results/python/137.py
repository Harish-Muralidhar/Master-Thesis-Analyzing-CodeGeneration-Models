

#Code
class set:
    def __init__(self,val):
        self.val = val
        self.rank = 0
        self.parent = self
        self.size = 1
    def getparent(self):
        if self==self.parent:
            return self
        self.parent = self.parent.getparent()
        return self.parent
    def union(self,other):
        root1 = self.getparent()
        root2 = other.getparent()
        if root1.rank>root2.rank:
            root2.parent = root1
            root1.size+=root2.size
            root2.size=0
        elif root2.rank>root1.rank:
            root1.parent = root2
            root2.size+=root1.size
            root1.size=0
        else:
            root1.parent = root2
            root2.rank+=1
            root2.size+=root1.size
            root1.size=0
            
def find_kth_smallest(root,k):
    if root.size<k:
        return -1
    if k==1:
        return root.val
    return find_kth_smallest(root.getparent(),k-1)

if __name__=="__main__":
    n,q = map(int,input().split())
    s = []
    dic = {}
    for i in range(1,n+1):
        dic[i] = set(i)
        s.append(dic[i])
    for i in range(q):
        inp = input().split()
        if inp[0]=="UNION":
            dic[n+i+1] = set(n+i+1)
            dic[int(inp[1])].union(dic[int(inp[2])])
            dic[int(inp[1])].union(dic[n+i+1])
            s.append(dic[n+i+1])
        else:
            print(find_kth_smallest(dic[int(inp[1])].getparent(),int(inp[2])))

https://www.codechef.com/viewsolution/20473845
https://www.codechef.com/viewsolution/20473762
https://www.codechef.com/viewsolution/20473741
https://www.codechef.com/viewsolution/20473688
https://www.codechef.com/viewsolution/20473668
https://www.codechef.com/viewsolution/20473653
https://www.codechef.com/viewsolution/20473619
https://www.codechef.com/viewsolution/20473590
https://www.codechef.com/viewsolution/20473584
https://www.codechef.com/viewsolution/20473541
https://www.codechef.com/viewsolution/20473537
https://www.codechef.com/viewsolution/20473531
https://www.codechef.com/viewsolution/20473527
https://www.codechef.com/viewsolution/20473518
https://www.codechef.com/viewsolution/20473510
https://www.codechef.com/viewsolution/20473488
https://www.codechef.com/viewsolution/20473485
https://www.codechef.com/viewsolution/20473474
https://www.codechef.com/viewsolution/20473471
https://www.codechef.com/viewsolution/20473462
https://www.codechef.com/viewsolution/20473437
https://www.codechef.com/viewsolution/20473435
https://www.codechef.com/viewsolution/20473429
https://www.codechef.com/viewsolution/20473415
https://www.codechef.com/viewsolution/20473412
https://www.codechef.com/viewsolution/20473400
https://www.codechef.com/viewsolution/20473382
https://www.codechef.com/viewsolution/20473379
https://www.codechef.com/viewsolution/20473375
https://www.codechef.com/viewsolution/20473372
https://www.codechef.com/viewsolution/20473354
https://www.codechef.com/viewsolution/20473349
https://www.codechef.com/viewsolution/20473347
https://www.codechef.com/viewsolution/20473341
https://www.codechef.com/viewsolution/20473339
https://www.codechef.com/viewsolution/20473335
https://www.codechef.com/viewsolution/20473331
https://www.codechef.com/viewsolution/20473329
https://www.codechef.com/viewsolution/20473322
https://www.codechef.com/viewsolution/20473320
https://www.codechef.com/viewsolution/20473315
https://www.codechef.com/viewsolution/20473314
https://www.codechef.com/viewsolution/20473307
https://www.codechef.com/viewsolution/20473305
https://www.codechef.com/viewsolution/20473304
https://www.codechef.com/viewsolution/20473299
https://www.codechef.com/viewsolution/20473298
https://www.codechef.com/viewsolution/20473293
https://www.codechef.com/viewsolution/20473292
https://www.codechef.com/viewsolution/20473291
https://www.codechef.com/viewsolution/20473286
https://www.codechef.com/viewsolution/20473285
https://www.codechef.com/viewsolution/20473284
https://www.codechef.com/viewsolution/20473279
https://www.codechef.com/viewsolution/20473278
https://www.codechef.com/viewsolution/20473277
https://www.codechef.com/viewsolution/20473272
https://www.codechef.com/viewsolution/20473271
https://www.codechef.com/viewsolution/20473270
https://www.codechef.com/viewsolution/20473265
https://www.codechef.com/viewsolution/20473263
https://www.codechef.com/viewsolution/20473262
https://www.codechef.com/viewsolution/20473258
https://www.codechef.com/viewsolution/20473255
https://www.codechef.com/viewsolution/20473254
https://www.codechef.com/viewsolution/20473249
https://www.codechef.com/viewsolution/20473248
https://www.codechef.com/viewsolution/20473247
https://www.codechef.com/viewsolution/20473243
https://www.codechef.com/viewsolution/20473242
https://www.codechef.com/viewsolution/20473241
https://www.codechef.com/viewsolution/20473236
https://www.codechef.com/viewsolution/20473235
https://www.codechef.com/viewsolution/20473234
https://www.codechef.com/viewsolution/20473229
https://www.codechef.com/viewsolution/20473228
https://www.codechef.com/viewsolution/20473227
https://www.codechef.com/viewsolution/20473223
https://www.codechef.com/viewsolution/20473222
https://www.codechef.com/viewsolution/20473221
https://www.codechef.com/viewsolution/20473216
https://www.codechef.com/viewsolution/20473215
https://www.codechef.com/viewsolution/20473214
https://www.codechef.com/viewsolution/20473209
https://www.codechef.com/viewsolution/20473208
https://www.codechef.com/viewsolution/20473207
https://www.codechef.com/viewsolution/20473203
https://www.codechef.com/viewsolution/20473202
https://www.codechef.com/viewsolution/20473201
https://www.codechef.com/viewsolution/20473196
https://www.codechef.com/viewsolution/20473195
https://www.codechef.com/viewsolution/20473194
https://www.codechef.com/viewsolution/20473189
https://www.codechef.com/viewsolution/20473188
https://www.codechef.com/viewsolution/20473187
https://www.codechef.com/viewsolution/20473183
https://www.codechef.com/viewsolution/20473182
https://www.codechef.com/viewsolution/20473181
https://www.codechef.com/viewsolution/20473176
https://www.codechef.com/viewsolution/20473174
https://www.codechef.com/viewsolution/20473173
https://www.codechef.com/viewsolution/20473168
https://www.codechef.com/viewsolution/20473167
https://www.codechef.com/viewsolution/20473166
https://www.codechef.com/viewsolution/20473161
https://www.codechef.com/viewsolution/20473160
https://www.codechef.com/viewsolution/20473159
https://www.codechef.com/viewsolution/20473154
https://www.codechef.com/viewsolution/20473153
https://www.codechef.com/viewsolution/20473152
https://www.codechef.com/viewsolution/20473148
https://www.codechef.com/viewsolution/20473147
https://www.codechef.com/viewsolution/20473146
https://www.codechef.com/viewsolution/20473141
https://www.codechef.com/viewsolution/20473140
https://www.codechef.com/viewsolution/20473139
https://www.codechef.com/viewsolution/20473134
https://www.codechef.com/viewsolution/20473133
https://www.codechef.com/viewsolution/20473132
https://www.codechef.com/viewsolution/20473127
https://www.codechef.com/viewsolution/20473126
https://www.codechef.com/viewsolution/20473125
https://www.codechef.com/viewsolution/20473121
https://www.codechef.com/viewsolution/20473120
https://www.codechef.com/viewsolution/20473119
https://www.codechef.com/viewsolution/20473114
https://www.codechef.com/viewsolution/20473113
https://www.codechef.com/viewsolution/20473112
https://www.codechef.com/viewsolution/20473107
https://www.codechef.com/viewsolution/20473106
https://www.codechef.com/viewsolution/20473105
https://www.codechef.com/viewsolution/20473101
https://www.codechef.com/viewsolution/20473100
https://www.codechef.com/viewsolution/20473099
https://www.codechef.com/viewsolution/20473094
https://www.codechef.com/viewsolution/20473093
https://www.codechef.com/viewsolution/20473092
https://www.codechef.com/viewsolution/20473087
https://www.codechef.com/viewsolution/20473086
https://www.codechef.com/viewsolution/20473085
https://www.codechef.com/viewsolution/20473081
https://www.codechef.com/viewsolution/20473080
https://www.codechef.com/viewsolution/20473079
https://www.codechef.com/viewsolution/20473074
https://www.codechef.com/viewsolution/20473073
https://www.codechef.com/viewsolution/20473072
https://www.codechef.com/viewsolution/20473067
https://www.codechef.com/viewsolution/20473066
https://www.codechef.com/viewsolution/20473065
https://www.codechef.com/viewsolution/20473060
https://www.codechef.com/viewsolution/20473059
https://www.codechef.com/viewsolution/20473058
https://www.codechef.com/viewsolution/20473053
https://www.codechef.com/viewsolution/20473052
https://www.codechef.com/viewsolution/20473051
https://www.codechef.com/viewsolution/20473046
https://www.codechef.com/viewsolution/20473045
https://www.codechef.com/viewsolution/20473044
https://www.codechef.com/viewsolution/20473040
https://www.codechef.com/viewsolution/20473039
https://www.codechef.com/viewsolution/20473038
https://www.codechef.com/viewsolution/20473033
https://www.codechef.com/viewsolution/20473032
https://www.codechef.com/viewsolution/20473031
https://www.codechef.com/viewsolution/20473026
https://www.codechef.com/viewsolution/20473025
https://www.codechef.com/viewsolution/20473024
https://www.codechef.com/viewsolution/20473019
https://www.codechef.com/viewsolution/20473018
https://www.codechef.com/viewsolution/20473017
https://www.codechef.com/viewsolution/20473012
https://www.codechef.com/viewsolution/20473011
https://www.codechef.com/viewsolution/20473010
https://www.codechef.com/viewsolution/20473005
https://www.codechef.com/viewsolution/20473004
https://www.codechef.com/viewsolution/20473003
https://www.codechef.com/viewsolution/20472998
https://www.codechef.com/viewsolution/20472997
https://www.codechef.com/viewsolution/20472996
https://www.codechef.com/viewsolution/20472991
https://www.codechef.com/viewsolution/20472990
https://www.codechef.com/viewsolution/20472989
https://www.codechef.com/viewsolution/20472984
https://www.codechef.com/viewsolution/20472983
https://www.codechef.com/viewsolution/20472982
https://www.codechef.com/viewsolution/20472977
https://www.codechef.com/viewsolution/2047