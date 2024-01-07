/*
Following is the class structure of the Node class:

class Node
{
public:
    int data;
    Node *next;
    Node()
    {
        this->data = 0;
        next = NULL;
    }
    Node(int data)
    {
        this->data = data;
        this->next = NULL;
    }
    Node(int data, Node* next)
    {
        this->data = data;
        this->next = next;
    }
};
*/

Node *removeKthNode(Node *head, int K)
{

    if (head == nullptr || K == 0)
    {
        return head;
    }

    Node *slow = head;
    Node *fast = head;

    for (int i = 0; i < K; i++)
    {

        if (fast->next == nullptr)
        {
            Node *next = head->next;
            head->next = nullptr;
            head = next;

            return head;
        }
        else
        {
            fast = fast->next;
        }
    }

    while (fast->next != nullptr)
    {
        slow = slow->next;
        fast = fast->next;
    }

    slow->next = slow->next->next;

    return head;
}
