/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* dailyTemperatures(int* temperatures, int temperaturesSize, int* returnSize) {
    int* answer = (int*)calloc(temperaturesSize, sizeof(int));
    *returnSize = temperaturesSize;

    for (int i = temperaturesSize - 2; i >= 0; i--) {
        int j = i + 1;

        while (j < temperaturesSize && temperatures[j] <= temperatures[i]) {
            if (answer[j] > 0) {
                j += answer[j];  // Skip forward
            } else {
                j = temperaturesSize;  // No warmer day
            }
        }

        if (j < temperaturesSize) {
            answer[i] = j - i;
        }
    }

    return answer;
}