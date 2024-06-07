class Solution(object):
    def replaceWords(self, dictionary, sentence):
        """
        :type dictionary: List[str]
        :type sentence: str
        :rtype: str
        """

        #Initialise a dictionary with key as first character of a string and value as list of strings starting with the character
        newDict = {}

        #Populate dictionary with words from given dictionary
        for i in range(len(dictionary)):
            if dictionary[i][0] in newDict.keys():
                newDict[dictionary[i][0]].append(dictionary[i])
            else:
                newDict[dictionary[i][0]] = [dictionary[i]]
        
        #Replace word with root if found in new dictionary
        wordSplit = sentence.split()
        for i in range(len(wordSplit)):
            for word in newDict.get(wordSplit[i][0], []):
                if wordSplit[i].startswith(word):
                    wordSplit[i] = word
        
        return ' '.join(wordSplit)
