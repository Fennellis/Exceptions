Controller ctrl = new(new LineView());
string PATH = "logs";

do
{
    Console.Clear();

    string[]? temp = ctrl.Create();
    if (temp != null)
    {
        string currentPath = $"{PATH}\\{temp[0]}.txt";
        string toWrite = String.Join(" ", temp);
        bool isExist = false;
        try
        {
            using (StreamReader reader = new(currentPath))
            {
                string? line;
                while ((line = reader.ReadLine()) != null)
                {
                    if (line.Equals(toWrite))
                    {
                        isExist = true;
                        System.Console.WriteLine("Запись уже существует");
                    }
                        
                }
            }
        }
        catch (FileNotFoundException)
        {
            File.Create(currentPath).Close();
        }

        if (!isExist)
        {
            using (StreamWriter writer = new(currentPath, true))
            {
                writer.WriteLine(toWrite);
            }
        }
    }

    System.Console.WriteLine("Нажмите любую клавишу (ESC для выхода)");
} while (Console.ReadKey().Key != ConsoleKey.Escape);