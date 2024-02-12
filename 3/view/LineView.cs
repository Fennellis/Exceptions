class LineView : View
{
    public override string[] Input()
    {
        System.Console.WriteLine("Введите запись:");
        string[] elements = Console.ReadLine()!.Split();

        if (elements.Length != 6)
            throw new IOException();
        return elements;
    }
}