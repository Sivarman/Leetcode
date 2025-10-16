/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    int n = 0;
    struct ListNode* temp = head;
    while (temp != NULL) {
        n += 1;
        temp = temp->next;
    }
    temp=head;
    n = n / 2;
    int cnt = 0;
    while (cnt < n) {
        temp = temp->next;
        cnt++;
    }
    return temp;
}
