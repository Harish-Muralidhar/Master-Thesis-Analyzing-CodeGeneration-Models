
# In[1]:


import numpy as np


# In[3]:


def anagram(s):
    n = len(s)
    s = s.lower()
    
    count = {}
    for letter in s:
        if letter in count.keys():
            count[letter] += 1
        else:
            count[letter] = 1
    #print(count)
    #print(list(count.keys()))
    #print(list(count.values()))
    
    if len(list(count.keys())) > 2:
        return -1
    elif len(list(count.keys())) == 1:
        return 0
    elif len(list(count.keys())) == 2:
        if '_' in list(count.keys()):
            #print('yes')
            if count['_'] % 2 == 0 and count['_'] != 0:
                if count[list(count.keys())[0]] == count[list(count.keys())[1]]:
                    return int(count['_']/2)
                else:
                    return -1
            else:
                return -1
        else:
            if count[list(count.keys())[0]] == count[list(count.keys())[1]]:
                return 0
            else:
                return -1


# In[4]:


def anagram(s):
    n = len(s)
    s = s.lower()
    
    count = {}
    for letter in s:
        if letter in count.keys():
            count[letter] += 1
        else:
            count[letter] = 1
            
    if len(list(count.keys())) > 2:
        return -1
    elif len(list(count.keys())) == 1:
        return 0
    elif len(list(count.keys())) == 2:
        if '_' in list(count.keys()):
            if count['_'] % 2 == 0 and count['_'] != 0:
                if count[list(count.keys())[0]] == count[list(count.keys())[1]]:
                    return int(count['_']/2)
                else:
                    return -1
            else:
                return -1
        else:
            if count[list(count.keys())[0]] == count[list(count.keys())[1]]:
                return 0
            else:
                return -1


# In[5]:


s = 'AAABBB'
anagram(s)


# In[6]:


s = 'ABABABABABABABABABABABABABABABABABABABABABABABABAB'
anagram(s)


# In[7]:


s = 'AAABBAABB'
anagram(s)


# In[8]:


s = 'ABAC'
anagram(s)


# In[9]:


s = 'ABAACCA'
anagram(s)


# In[ ]: