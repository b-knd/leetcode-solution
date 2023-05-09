class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        rowStart = 0;
        rowEnd = len(matrix)-1;
        colStart = 0;
        colEnd = len(matrix[0])-1;

        res = [];
        row = 0;
        col = 0;
        while (rowStart <= rowEnd and colStart <= colEnd):            
            #going to rightmost
            while rowStart <= rowEnd and colStart <= colEnd and col <= colEnd:
                res.append(matrix[row][col]);
                col += 1; 
            rowStart += 1;
            row = rowStart;
            col = colEnd;
            #going downmost
            while rowStart <= rowEnd and colStart <= colEnd and row <= rowEnd:
                res.append(matrix[row][col]);
                row += 1;
            colEnd -= 1;
            col = colEnd;
            row = rowEnd;
            #going leftmost
            while rowStart <= rowEnd and colStart <= colEnd and col >= colStart:
                res.append(matrix[row][col]);
                col -= 1;
            rowEnd -= 1;
            row = rowEnd;
            col = colStart;
            #going upmost
            while rowStart <= rowEnd and colStart <= colEnd and row >= rowStart:
                res.append(matrix[row][col]);
                row -= 1;
            colStart += 1;
            row = rowStart;
            col = colStart;
        return res;
        
        
