/**
 * Definition of linked list:
 *
 * class Node {
 * public:
 *      int data;
 *      Node *next;
 *      Node() {
 *          this->data = 0;
 *          this->next = NULL;
 *      }
 *      Node(int data) {
 *          this->data = data;
 *          this->next = NULL;
 *      }
 *      Node (int data, Node *next) {
 *          this->data = data;
 *          this->next = next;
 *      }
 * };
 *
 *************************************************************************/
Node *reverse(Node *head)
{
    Node *prev = nullptr;
    Node *curr = head;
    Node *next = nullptr;
    while (curr != nullptr)
    {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

Node *addOne(Node *head)
{

    Node *rev = reverse(head);
    Node *temp = rev;
    int carry = 1;
    while (temp != nullptr)
    {
        int sum = temp->data + carry;
        temp->data = sum % 10;
        carry = sum / 10;
        if (temp->next == nullptr && carry > 0)
        {
            temp->next = new Node(carry);
            break;
        }
        temp = temp->next;
    }
    return reverse(rev);
}
